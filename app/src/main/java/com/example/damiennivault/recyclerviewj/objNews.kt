package com.example.damiennivault.recyclerviewj

data class News(var author: String?,
                var content: String?,
                var date: String?,
                var summary: String?,
                var picture: String?,
                var link: String?,
                var title: String?){
    constructor(): this(null, null, null, null,null,null,null)
}