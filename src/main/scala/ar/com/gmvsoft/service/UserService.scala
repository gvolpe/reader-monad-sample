package ar.com.gmvsoft.service

import ar.com.gmvsoft.model.Model.User
import ar.com.gmvsoft.repository.UserRepository
import scalaz.Reader

trait UserService {

  def findAllReader = Reader((userRepository: UserRepository) =>
    userRepository.findAll
  )

  def saveReader(user: User) = Reader((userRepository: UserRepository) =>
    userRepository.save(user)
  )

}
