defmodule Grades.Calculator do
  @moduledoc """
  Calcule la note finale à partir des devoirs (homework), labs, midterm et final.

  Pondération :
    - Homework : 10%
    - Labs     : 20%
    - Midterm  : 30%
    - Final    : 40%

  Les labs sont sur des barèmes différents (ex: /100, /25) mais on en fait
  une moyenne simple (moyenne des pourcentages "bruts" tels qu'entrés),
  tel que discuté en équipe.
  """

  @weight_homework 0.10
  @weight_labs 0.20
  @weight_midterm 0.30
  @weight_final 0.40

  @doc """
  Retourne la note en pourcentage (float, arrondi à 1 décimale) ou "--"
  si les données sont incomplètes/invalides.
  """
  def percentage_grade(grades) do
    case compute(grades) do
      nil -> "--"
      pct -> Float.round(pct, 1)
    end
  end

  @doc """
  Retourne la note numérique (même valeur que percentage_grade dans cette
  implémentation simple) ou "--" si incomplet.
  """
  def numeric_grade(grades) do
    percentage_grade(grades)
  end

  @doc """
  Retourne la lettre correspondant à la note, ou "--" si incomplet.
  """
  def letter_grade(grades) do
    case compute(grades) do
      nil -> "--"
      pct -> to_letter(pct)
    end
  end

  # ---- Logique interne ----

  defp compute(%{homework: homework, labs: labs, midterm: midterm, final: final}) do
    with {:ok, hw_avg} <- average(homework),
         {:ok, labs_avg} <- average(labs),
         {:ok, mid} <- parse(midterm),
         {:ok, fin} <- parse(final) do
      hw_avg * @weight_homework +
        labs_avg * @weight_labs +
        mid * @weight_midterm +
        fin * @weight_final
    else
      _ -> nil
    end
  end

  defp compute(_), do: nil

  defp average(values) when is_list(values) and length(values) > 0 do
    parsed = Enum.map(values, &parse/1)

    if Enum.any?(parsed, &(&1 == :error)) do
      :error
    else
      nums = Enum.map(parsed, fn {:ok, v} -> v end)
      {:ok, Enum.sum(nums) / length(nums)}
    end
  end

  defp average(_), do: :error

  defp parse(nil), do: :error
  defp parse(""), do: :error

  defp parse(str) when is_binary(str) do
    case Float.parse(String.trim(str)) do
      {value, _rest} -> {:ok, value}
      :error -> :error
    end
  end

  defp parse(_), do: :error

  defp to_letter(pct) when pct >= 90, do: "A+"
  defp to_letter(pct) when pct >= 85, do: "A"
  defp to_letter(pct) when pct >= 80, do: "A-"
  defp to_letter(pct) when pct >= 77, do: "B+"
  defp to_letter(pct) when pct >= 73, do: "B"
  defp to_letter(pct) when pct >= 70, do: "B-"
  defp to_letter(pct) when pct >= 67, do: "C+"
  defp to_letter(pct) when pct >= 63, do: "C"
  defp to_letter(pct) when pct >= 60, do: "C-"
  defp to_letter(pct) when pct >= 57, do: "D+"
  defp to_letter(pct) when pct >= 53, do: "D"
  defp to_letter(pct) when pct >= 50, do: "D-"
  defp to_letter(_pct), do: "F"
end