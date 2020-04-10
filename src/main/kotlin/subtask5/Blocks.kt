package subtask5

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import kotlin.reflect.KClass

class Blocks {

    fun getData(blockA: Array<Any>, blockB: KClass<*>): Any  {

        return when(blockB){
            String::class -> blockA.filterIsInstance<String>().joinToString ("")
            Int::class -> blockA.filterIsInstance<Int>().sum()//blockA.sumBy {if(it is Int) it else 0}
            LocalDate::class -> blockA.filterIsInstance<LocalDate>().max()!!.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"))
            else -> ""
        }
    }
}
