//package me.kylo.first
//
//class HtmlCreator {
//    fun renderPersonList(persons: Collection<Person>) =
//        createHTML().table {
//            for (person in persons) {
//                tr {
//                    td { +person.name }
//                    td { +person.age }
//                }
//            }
//        }
//}