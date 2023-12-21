package com.daike.quizapp

object Constants {

    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"



    fun getQuestions():ArrayList<Questions>{
        val questionsList = ArrayList<Questions>()
        val que1 = Questions(
            1,"What country does this flag belongs to?",
            R.drawable.ic_flag_of_argentina,
            "Argentina", "Australia",
            "Armenia", "Austria",
            1
        )
        questionsList.add(que1)

        val que2 = Questions(
            2,"What country does this flag belongs to?",
            R.drawable.ic_flag_of_australia,
            "Argentina", "Australia",
            "Armenia", "Austria",
            2
        )
        questionsList.add(que2)

        val que3 = Questions(
            3,"What country does this flag belongs to?",
            R.drawable.ic_flag_of_belgium,
            "Argentina", "Australia",
            "Belgium", "Austria",
            3
        )
        questionsList.add(que3)

        val que4 = Questions(
            4,"What country does this flag belongs to?",
            R.drawable.ic_flag_of_brazil,
            "Argentina", "Australia",
            "Armenia", "Brazil",
            4
        )
        questionsList.add(que4)

        val que5 = Questions(
            5,"What country does this flag belongs to?",
            R.drawable.ic_flag_of_denmark,
            "Argentina", "Denmark",
            "Armenia", "Austria",
            2
        )
        questionsList.add(que5)

        val que6 = Questions(
            6,"What country does this flag belongs to?",
            R.drawable.ic_flag_of_fiji,
            "Argentina", "Australia",
            "Fiji", "Austria",
            3
        )
        questionsList.add(que6)

        val que7 = Questions(
            7,"What country does this flag belongs to?",
            R.drawable.ic_flag_of_germany,
            "Germany", "Australia",
            "Armenia", "Austria",
            1
        )
        questionsList.add(que7)

        val que8 = Questions(
            8,"What country does this flag belongs to?",
            R.drawable.ic_flag_of_india,
            "Argentina", "Australia",
            "Armenia", "India",
            4
        )
        questionsList.add(que8)

        val que9 = Questions(
            9,"What country does this flag belongs to?",
            R.drawable.ic_flag_of_kuwait,
            "Argentina", "Australia",
            "Kuwait", "Austria",
            3
        )
        questionsList.add(que9)

        val que10 = Questions(
            10,"Who is the worlds shortest man in ?",
            R.drawable.ic_flag_of_greece,
            "Greece", "Armenia",
            "Uruguay", "New Zealand",
            1
        )
        questionsList.add(que10)

        return questionsList
    }

}