package com.chriswk.base64

import org.scalatra.test.specs2._

// For more on Specs2, see http://etorreborre.github.com/specs2/guide/org.specs2.guide.QuickStart.html
class Base64ServletSpec extends ScalatraSpec { def is =
  "GET / on Base64Servlet"                     ^
    "should return status 200"                  ! root200^
                                                end

  addServlet(classOf[Base64Servlet], "/*")

  def root200 = get("/") {
    status must_== 200
  }
}
