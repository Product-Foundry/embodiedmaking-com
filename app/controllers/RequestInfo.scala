package controllers

import securesocial.core.Identity
import securesocial.core.SecureSocial

case class RequestInfo(user: Option[Identity], uri: String)

trait ProvidesRequestInfo extends SecureSocial {
  implicit def requestInfo[A](implicit request: RequestWithUser[A]): RequestInfo = {
    RequestInfo(request.user, request.uri)
  }
}


