package com.example.room_db.Repository

import androidx.lifecycle.LiveData
import com.example.room_db.Data.UserDao
import com.example.room_db.Model.User

class UserRepository(private val userDao : UserDao) {
    val readAllData: LiveData<List<User>> = userDao.readAllData()

    suspend fun addUser(user: User){
        userDao.addUser(user)
    }
}