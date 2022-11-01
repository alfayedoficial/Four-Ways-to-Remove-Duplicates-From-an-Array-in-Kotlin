/**
 * Four Ways to Remove Duplicates From an Array in Kotlin
 * @Created by Ali Al Fayed on 2022-11-01.
 * @Owner Article: Ishan Khanna
 * @see Article: [ https://www.droidchef.dev/the-best-way-to-remove-duplicates-from-an-array-in-kotlin/]
 */

data class Student(val id: Int, val name: String)

val students = arrayOf(
    Student(1, "John"),
    Student(2, "Jane"),
    Student(3, "Mary"),
    Student(4, "Peter"),
    Student(5, "Mark"),
    Student(5, "Mark"),
    Student(1, "John"),
)

/*
* Return type of toSet() is a Set<T>
* Internally it calls toCollection()
* It guarantees the preservation of the iteration order of the elements.
* */
val deDupedStudentsBySet = students.toSet()

/*
* Return type of toHashSet() is a HashSet<T>
* Internally it calls toCollection()
* It does not guarantee the preservation of the iteration order of the elements.
* */
val deDupedStudentsByHashSet = students.toHashSet()

/*
* Return type of toMutableSet() is a MutableSet<T>
* Internally it calls toCollection()
* It preserves the iteration order of the elements as it uses LinkedHashSet<T> implementation of a MutableSet<T>
* */
val deDupedStudentsByMutableSet = students.toMutableSet()

/*
* Return type of distinct() is an Array
* Internally it calls toMutableSet() followed by toList()
* Only use this if you want your return type to be an Array.
* It does not guarantee the preservation of the iteration order of the elements.
* */
val deDupedStudentsByDistinct = students.distinct()
