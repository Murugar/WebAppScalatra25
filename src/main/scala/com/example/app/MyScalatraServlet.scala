package com.example.app

import org.scalatra._

class MyScalatraServlet extends MyScalatraWebAppStack {

  get("/") {
    <html>
      <body>
        <h1>Hello Scalatra!</h1>
        Say <a href="hello-scalate">Welcome to Scalatra</a>.
      </body>
    </html>
  }

}
