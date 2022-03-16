package com.jeddi.mybackgroundthread

interface MyAsyncCallback {
    fun onPreExecute()
    fun onPostExecute(text: String)
}