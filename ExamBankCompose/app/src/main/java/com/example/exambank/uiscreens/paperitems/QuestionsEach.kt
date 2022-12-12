package com.example.exambank.uiscreens.paperitems

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.exambank.datautils.*
import com.example.exambank.ui.theme.black
import com.example.exambank.ui.theme.texttitlewhite

// 41978



@Composable
fun QuestionEach() {
    Column {
        // 1
        LazyColumn {
            item {
                QuestionNumberTemplate(
                    quizTitle = "Question 1: ",
                    quizMarks = "30 Marks (Compulsory)"
                )
            }
                items(QuestionOne.listOne.size) {
                QuestionOne(QuestionOne.listOne[it])
            }
            item {
                QuestionNumberTemplate(
                    quizTitle = "Question 2: ",
                    quizMarks = "20 Marks"
                )
            }
            items(QuestionTwo.listTwo.size) {
                QuestionTwo(QuestionTwo.listTwo[it])
            }
            item {
                QuestionNumberTemplate(
                    quizTitle = "Question 3: ",
                    quizMarks = "20 Marks"
                )
            }
            items(QuestionThree.listThree.size) {
                QuestionThree(QuestionThree.listThree[it])
            }
            item {
                QuestionNumberTemplate(
                    quizTitle = "Question 4: ",
                    quizMarks = "20 Marks"
                )
            }
            items(QuestionFour.listFour.size) {
                QuestionFour(QuestionFour.listFour[it])
            }
//            items(QuestionOne.listOne.size) {
//                QuestionFive(QuestionFive.listFive[it])
//            }
        }
    }
}

@Composable
fun QuestionOne(listOne: Questions) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(2.dp)
            .height(25.dp)
            .background(color = texttitlewhite)



    ) {
        Row(
            modifier = Modifier
                .padding(2.dp)
                .fillMaxWidth()
        ) {
            Text(
                modifier = Modifier
                    .padding(start = 5.dp, end = 5.dp)
                    .align(Alignment.CenterVertically),
                text = listOne.quizNumber,
                color = black,
                fontSize = 12.sp
            )
            Text(
                modifier = Modifier
                    .width(310.dp)
                    .padding(horizontal = 0.dp)
                    .align(Alignment.CenterVertically),
                text = listOne.quizContent,
                color = black,
                fontSize = 12.sp
            )
            Text(
                modifier = Modifier
                    .padding(start = 2.dp, end = 0.dp)
                    .align(Alignment.CenterVertically),
                text = listOne.quizMarks,
                color = black,
                fontSize = 12.sp,
            )
        }
    }
}


@Composable
fun QuestionTwo(lisTwo: Questions) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(2.dp)
            .height(25.dp)
            .background(color = texttitlewhite)
    ) {
        Row(
            modifier = Modifier
                .padding(2.dp)
                .fillMaxWidth(),


            ) {
            Text(
                modifier = Modifier
                    .padding(start = 5.dp, end = 5.dp)
                    .align(Alignment.CenterVertically),
                text = lisTwo.quizNumber,
                color = black,
                fontSize = 12.sp
            )
            Text(
                modifier = Modifier
                    .width(310.dp)
                    .padding(horizontal = 0.dp)
                    .align(Alignment.CenterVertically),
                text = lisTwo.quizContent,
                color = black,
                fontSize = 12.sp
            )
            Text(
                modifier = Modifier
                    .padding(start = 2.dp, end = 0.dp)
                    .align(Alignment.CenterVertically),
                text = lisTwo.quizMarks,
                color = black,
                fontSize = 12.sp,
            )
        }
    }
}

@Composable
fun QuestionThree(listThree: Questions) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(2.dp)
            .height(25.dp)
            .background(color = texttitlewhite)
    ) {
        Row(
            modifier = Modifier
                .padding(2.dp)
                .fillMaxWidth(),


            ) {
            Text(
                modifier = Modifier
                    .padding(start = 5.dp, end = 5.dp)
                    .align(Alignment.CenterVertically),
                text = listThree.quizNumber,
                color = black,
                fontSize = 12.sp
            )
            Text(
                modifier = Modifier
                    .width(310.dp)
                    .padding(horizontal = 0.dp)
                    .align(Alignment.CenterVertically),
                text = listThree.quizContent,
                color = black,
                fontSize = 12.sp
            )
            Text(
                modifier = Modifier
                    .padding(start = 2.dp, end = 0.dp)
                    .align(Alignment.CenterVertically),
                text = listThree.quizMarks,
                color = black,
                fontSize = 12.sp,
            )
        }
    }
}
@Composable
fun QuestionFour(listFour: Questions) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(2.dp)
            .height(25.dp)
            .background(color = texttitlewhite)
    ) {
        Row(
            modifier = Modifier
                .padding(2.dp)
                .fillMaxWidth(),


            ) {
            Text(
                modifier = Modifier
                    .padding(start = 5.dp, end = 5.dp)
                    .align(Alignment.CenterVertically),
                text = listFour.quizNumber,
                color = black,
                fontSize = 12.sp
            )
            Text(
                modifier = Modifier
                    .width(310.dp)
                    .padding(horizontal = 0.dp)
                    .align(Alignment.CenterVertically),
                text = listFour.quizContent,
                color = black,
                fontSize = 12.sp
            )
            Text(
                modifier = Modifier
                    .padding(start = 2.dp, end = 0.dp)
                    .align(Alignment.CenterVertically),
                text = listFour.quizMarks,
                color = black,
                fontSize = 12.sp,
            )
        }
    }
}
@Composable
fun QuestionFive(listFive: Questions) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(2.dp)
            .height(25.dp)
            .background(color = texttitlewhite)
    ) {
        Row(
            modifier = Modifier
                .padding(2.dp)
                .fillMaxWidth(),


            ) {
            Text(
                modifier = Modifier
                    .padding(start = 5.dp, end = 5.dp)
                    .align(Alignment.CenterVertically),
                text = listFive.quizNumber,
                color = black,
                fontSize = 12.sp
            )
            Text(
                modifier = Modifier
                    .width(310.dp)
                    .padding(horizontal = 0.dp)
                    .align(Alignment.CenterVertically),
                text = listFive.quizContent,
                color = black,
                fontSize = 12.sp
            )
            Text(
                modifier = Modifier
                    .padding(start = 2.dp, end = 0.dp)
                    .align(Alignment.CenterVertically),
                text = listFive.quizMarks,
                color = black,
                fontSize = 12.sp,
            )
        }
    }
}

@Composable
@Preview
fun PreviewQuestionEach() {
    QuestionEach()
}