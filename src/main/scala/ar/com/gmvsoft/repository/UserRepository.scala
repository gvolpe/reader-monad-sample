package ar.com.gmvsoft.repository

import ar.com.gmvsoft.model.Model.User

trait UserRepository {

  def findAll: List[User]
  def save(user: User): Unit

}
