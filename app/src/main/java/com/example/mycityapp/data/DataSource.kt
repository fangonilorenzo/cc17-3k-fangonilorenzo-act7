package com.example.mycityapp.data

import com.example.mycityapp.R

object DataSource {

    val defaultCategory = Category(
        name = R.string.defualt_name,
        picture = R.drawable.gym,
        reccomendationList = listOf()
    )

    val defaultReccomendation = Reccomendation(
        title = R.string.defualt_name,
        text = R.string.defualt_name,
        image = R.drawable.gym
    )

    val categories = listOf(

        //Sights
        Category(
            name = R.string.category_1,
            picture = R.drawable.sights,
            reccomendationList = listOf(
                Reccomendation(
                    title = R.string.C1_Reccomendation1,
                    text = R.string.C1_Reccomendation1_text,
                    image = R.drawable.spire
                ),
                Reccomendation(
                    title = R.string.C1_Reccomendation2,
                    text = R.string.C1_Reccomendation2_text,
                    image = R.drawable.botanic_gardens
                ),
                Reccomendation(
                    title = R.string.C1_Reccomendation3,
                    text = R.string.C1_Reccomendation3_text,
                    image = R.drawable.portmanock_beach
                ),
                Reccomendation(
                    title = R.string.C1_Reccomendation4,
                    text = R.string.C1_Reccomendation4_text,
                    image = R.drawable.bray_head_mountain
                ),
                Reccomendation(
                    title = R.string.C1_Reccomendation5,
                    text = R.string.C1_Reccomendation5_text,
                    image = R.drawable.st_patricks_church
                )
            )
        ),

        //Food Place
        Category(
            name = R.string.category_2,
            picture = R.drawable.foodplace,
            reccomendationList = listOf(
                Reccomendation(
                    title = R.string.C2_Reccomendation1,
                    text = R.string.C2_Reccomendation1_text,
                    image = R.drawable.underground_indian_place
                ),
                Reccomendation(
                    title = R.string.C2_Reccomendation2,
                    text = R.string.C2_Reccomendation2_text,
                    image = R.drawable.welcome_city
                ),
                Reccomendation(
                    title = R.string.C2_Reccomendation3,
                    text = R.string.C2_Reccomendation3_text,
                    image = R.drawable.kfc
                ),
                Reccomendation(
                    title = R.string.C2_Reccomendation4,
                    text = R.string.C2_Reccomendation4_text,
                    image = R.drawable.ginos
                ),
                Reccomendation(
                    title = R.string.C2_Reccomendation5,
                    text = R.string.C2_Reccomendation5_text,
                    image = R.drawable.wings
                )
            )
        ),

        //Gym
        Category(
            name = R.string.category_3,
            picture = R.drawable.gym,
            reccomendationList = listOf(
                Reccomendation(
                    title = R.string.C3_Reccomendation1,
                    text = R.string.C3_Reccomendation1_text,
                    image = R.drawable.flyefit
                ),
                Reccomendation(
                    title = R.string.C3_Reccomendation2,
                    text = R.string.C3_Reccomendation2_text,
                    image = R.drawable.westwood
                )
            )
        ),

        //Fun place
        Category(
            name = R.string.category_4,
            picture = R.drawable.funplace,
            reccomendationList = listOf(
                Reccomendation(
                    title = R.string.C4_Reccomendation1,
                    text = R.string.C4_Reccomendation1_text,
                    image = R.drawable.escape_room
                ),
                Reccomendation(
                    title = R.string.C4_Reccomendation2,
                    text = R.string.C4_Reccomendation2_text,
                    image = R.drawable.token
                ),
                Reccomendation(
                    title = R.string.C4_Reccomendation3,
                    text = R.string.C4_Reccomendation3_text,
                    image = R.drawable.cineworld
                ),
                Reccomendation(
                    title = R.string.C4_Reccomendation4,
                    text = R.string.C4_Reccomendation4_text,
                    image = R.drawable.ned_kellys
                )
            )
        )
    )
}