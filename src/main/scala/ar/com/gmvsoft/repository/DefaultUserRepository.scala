package ar.com.gmvsoft.repository

import ar.com.gmvsoft.model.Model.User

trait DefaultUserRepository extends UserRepository {

  def findAll: List[User] = List(User(123, "pepe@gmail.com"))
  def save(user: User): Unit = println("Saving user " + user.email)

}
