package ar.com.gmvsoft

import ar.com.gmvsoft.model.Model.User
import ar.com.gmvsoft.repository.DefaultUserRepository
import ar.com.gmvsoft.service.UserService

trait AppConfig extends UserService with DefaultUserRepository

object Application extends App with AppConfig {

  findAll.foreach { user =>
    println(user.email)
  }

  val user = User(3, "juan@gmail.com")
  save(user)

}

