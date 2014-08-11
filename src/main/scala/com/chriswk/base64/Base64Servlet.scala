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
    Base64.getEncoder().encodeToString(params("q").getBytes())
  }

  get("/decode") {
    new String(Base64.getDecoder().decode(params("q")))
  }
  
}
