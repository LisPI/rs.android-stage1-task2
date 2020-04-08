package subtask3

class Abbreviation {

    fun abbreviationFromA(a: String, b: String): String {
        var indexForA = 0

        for(charInB in b){
            indexForA = a.indexOf(ignoreCase = true, char = charInB, startIndex = indexForA + 1)
            if(indexForA == -1) return "NO"
        }

        return "YES"
    }
}
