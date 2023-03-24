package com.example.exambank.navigation

sealed class Routes( val route: String) {
    object SplashScreen: Routes("SplashScreen")
    object OnBoardScreen: Routes("OnBoardScreen")
    object Login: Routes("Login")
    object SignUp: Routes("SignUp")
    object ForgotPassword: Routes("ForgotPassword")
    object Home : Routes("Home_Screen")
    object MainScreen: Routes("MainScreen")
    object Account: Routes("Account")
    object AcademicYearView: Routes("academicyearview")
    object FullExamPaper: Routes("FullExamPaper")
    object JanApril2023: Routes("JanApril2023")
    object SeptDec2022: Routes("SeptDec2022")
    object MayAug2022: Routes("MayAug2022")
    object JanApril2022: Routes("JanApril2022")
    object SeptDec2021: Routes("SeptDec2021")
    object MayAug2021: Routes("MayAug2021")
    object JanApril2021: Routes("JanApril2021")
    object SeptDec2020: Routes("SeptDec2020")
    object MayAug2020: Routes("MayAug2020")
    object JanApril2020: Routes("JanApril2020")
    object SeptDec2019: Routes("SeptDec2019")
    object MayAug2019: Routes("MayAug2019")
    object JanApril2019: Routes("JanApril2019")
    object SeptDec2018: Routes("SeptDec2018")
    object MayAug2018: Routes("MayAug2018")
    object JanApril2018: Routes("JanApril2018")
    object SeptDec2017: Routes("SeptDec2017")
    object MayAug2017: Routes("MayAug2017")
    object JanApril2017: Routes("JanApril2017")
}