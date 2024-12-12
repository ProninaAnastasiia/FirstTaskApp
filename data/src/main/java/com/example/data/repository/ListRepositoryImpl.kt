package com.example.data.repository

import com.example.domain.data.entity.ListButton
import com.example.domain.data.entity.ListElement
import com.example.domain.data.repository.ListRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.withContext

class ListRepositoryImpl : ListRepository {
    private val list = listOf(
            ListElement(
                id = 0,
                image = "https://static14.tgcnt.ru/posts/_320/70/709a525ec2342734702f2ec8bd6ee741.jpg",
                title = "1 Layer",
                subtitle = "Edge of the Abyss",
                button = ListButton(
                    title = "test"
                )
            ),
            ListElement(
                id = 1,
                image = "https://i.pinimg.com/236x/bb/7f/68/bb7f681f268a85a9a657b1995aa8cfc6.jpg",
                title = "2 Layer",
                subtitle = "Forest of Temptation",
                button = ListButton(
                    title = "test"
                )
            ),
            ListElement(
                id = 2,
                image = "https://i.pinimg.com/236x/84/19/1e/84191eb8d781827a1988c906001bc460.jpg?nii=t",
                title = "3 Layer",
                subtitle = "The Great Fault",
                button = ListButton(
                    title = "test"
                )
            ),
            ListElement(
                id = 3,
                image = "https://i.pinimg.com/236x/68/81/bd/6881bdc1ccf9b16e8c080f0a4dde4e0d.jpg",
                title = "4 Layer",
                subtitle = "Goblets of Giants",
                button = ListButton(
                    title = "test"
                )
            ),
            ListElement(
                id = 4,
                image = "https://i.ytimg.com/vi/nusEKX3wLoE/mqdefault.jpg",
                title = "5 Layer",
                subtitle = "Sea of Corpses",
                button = ListButton(
                    title = "test"
                )
            )
        )
    override suspend fun getList(): List<ListElement> = withContext(Dispatchers.IO) {
        return@withContext list
    }

    override suspend fun getElement(id: Long): ListElement {
        return list.find { it.id == id }!!
    }
}