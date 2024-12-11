package com.example.data.repository

import com.example.domain.data.entity.ListButton
import com.example.domain.data.entity.ListElement
import com.example.domain.data.repository.ListRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.withContext

class ListRepositoryImpl : ListRepository {
    override suspend fun getList(): List<ListElement> = withContext(Dispatchers.IO) {
        return@withContext listOf(
            ListElement(
                id = 0,
                image = "https://i.pinimg.com/236x/68/81/bd/6881bdc1ccf9b16e8c080f0a4dde4e0d.jpg",
                title = "4 Layer",
                subtitle = "test",
                button = ListButton(
                    title = "test"
                )
            ),
            ListElement(
                id = 1,
                image = "https://i.pinimg.com/236x/68/81/bd/6881bdc1ccf9b16e8c080f0a4dde4e0d.jpg",
                title = "4 Layer",
                subtitle = "test",
                button = ListButton(
                    title = "test"
                )
            ),
            ListElement(
                id = 2,
                image = "https://i.pinimg.com/236x/68/81/bd/6881bdc1ccf9b16e8c080f0a4dde4e0d.jpg",
                title = "4 Layer",
                subtitle = "test",
                button = ListButton(
                    title = "test"
                )
            ),
            ListElement(
                id = 3,
                image = "https://i.pinimg.com/236x/68/81/bd/6881bdc1ccf9b16e8c080f0a4dde4e0d.jpg",
                title = "4 Layer",
                subtitle = "test",
                button = ListButton(
                    title = "test"
                )
            ),
            ListElement(
                id = 4,
                image = "https://i.pinimg.com/236x/68/81/bd/6881bdc1ccf9b16e8c080f0a4dde4e0d.jpg",
                title = "4 Layer",
                subtitle = "test",
                button = ListButton(
                    title = "test"
                )
            )
        )
    }

    override suspend fun getElement(id: Long): ListElement {
        return ListElement(
            id = id,
            image = "https://i.pinimg.com/236x/68/81/bd/6881bdc1ccf9b16e8c080f0a4dde4e0d.jpg",
            title = "4 Layer",
            subtitle = "test",
            button = ListButton(
                title = "test"
            )
        )
    }
}