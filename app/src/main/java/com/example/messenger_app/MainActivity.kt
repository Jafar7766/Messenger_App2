package com.example.messenger_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.messenger_app.adapter.ChatAdapter
import com.example.messenger_app.model.Chat
import com.example.messenger_app.model.Message
import com.example.messenger_app.model.Room

class MainActivity : AppCompatActivity() {

    lateinit var recyclerview:RecyclerView;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews();
    }

    fun initViews(){
        recyclerview = findViewById(R.id.recyclerview)
        recyclerview.setLayoutManager(GridLayoutManager(this, 1))

        refreshAdapter(getAllChats())
    }
    fun refreshAdapter(chats: ArrayList<Chat>){
        val adapter = ChatAdapter(this,chats)
        recyclerview.adapter = adapter
    }

    fun getAllChats(): ArrayList<Chat>{
       val chats: ArrayList<Chat> = ArrayList<Chat>()

        val rooms: ArrayList<Room> = ArrayList<Room>()
        rooms.add(Room(R.drawable.user2, "Jafar Bakhromov"))
        rooms.add(Room(R.drawable.user3, "Doston Ergashev"))
        rooms.add(Room(R.drawable.user2, "Jasur Rustamov"))
        rooms.add(Room(R.drawable.user3, "Eldor Shomurodov"))
        rooms.add(Room(R.drawable.user2, "Jafar Bakhromov"))
        rooms.add(Room(R.drawable.user2, "Jafar Bakhromov"))
        rooms.add(Room(R.drawable.user3, "Doston Ergashev"))
        rooms.add(Room(R.drawable.user2, "Zayin Kim"))
        rooms.add(Room(R.drawable.user3, "Eldor Shomurodov"))
        rooms.add(Room(R.drawable.user2, "Jafar Bakhromov"))

        chats.add(Chat(rooms))

        //Message

        chats.add(Chat(Message(R.drawable.user2, "Jafar", true)))
        chats.add(Chat(Message(R.drawable.user3, "John", false)))
        chats.add(Chat(Message(R.drawable.user2, "Jafar", true)))
        chats.add(Chat(Message(R.drawable.user3, "Mike", false)))
        chats.add(Chat(Message(R.drawable.user2, "Jafar", false)))
        chats.add(Chat(Message(R.drawable.user2, "Jafar", true)))
        chats.add(Chat(Message(R.drawable.user3, "Mike", false)))
        chats.add(Chat(Message(R.drawable.user2, "Jafar", false)))
        return chats
    }
}