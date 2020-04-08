package subtask2

class TimeConverter {

    fun toTextFormat(hour: String, minute: String): String {
        val h = hour.toInt()
        val m = minute.toInt()

        if((h > 12) or (m > 60))
            return ""

        val words = arrayOf(
            "",
            "one",
            "two",
            "three",
            "four",
            "five",
            "six",
            "seven",
            "eight",
            "nine",
            "ten",
            "eleven",
            "twelve",
            "thirteen",
            "fourteen",
            "fifteen",
            "sixteen",
            "seventeen",
            "eighteen",
            "nineteen",
            "twenty",
            "twenty one",
            "twenty two",
            "twenty three",
            "twenty four",
            "twenty five",
            "twenty six",
            "twenty seven",
            "twenty eight",
            "twenty nine")

        return when {
            m == 0 -> "${words[h]} o' clock"
            m == 30 -> "half past ${words[h]}"
            m == 15 -> "quarter past ${words[h]}"
            m == 45 -> "quarter to ${words[h + 1]}"
            m == 1 -> "one minute past ${words[h]}"
            m < 30 -> "${words[m]} minutes past ${words[h]}"
            m > 30 -> "${words[60 - m]} minutes to ${words[h + 1]}"

            else -> ""
        }
    }
}
