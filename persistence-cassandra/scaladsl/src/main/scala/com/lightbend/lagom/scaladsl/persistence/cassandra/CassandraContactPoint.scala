/*
 * Copyright (C) 2016 Lightbend Inc. <http://www.lightbend.com>
 */
package com.lightbend.lagom.scaladsl.persistence.cassandra

import java.net.URI

final case class CassandraContactPoint(name: String, uri: URI) {
  require(name != null, "name must not be null")
  require(uri != null, "uri must not be null")
}