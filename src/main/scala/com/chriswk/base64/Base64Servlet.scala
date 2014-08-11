package com.chriswk.base64

import org.scalatra._
import scalate.ScalateSupport
import java.util.Base64;

class Base64Servlet extends Base64funStack {

  get("/") {
    <html>
      <body>
        <h1>Hello, world!</h1>
        Say <a href="hello-scalate">hello to Scalate</a>.
      </body>
    </html>
  }

  get("/encode") {
    val x = params("q")
    Base64.getEncoder().encodeToString(x.getBytes())
  }

  get("/decode") {
    val x = params("q")
    new String(Base64.getDecoder().decode(x))
  }
  
}
