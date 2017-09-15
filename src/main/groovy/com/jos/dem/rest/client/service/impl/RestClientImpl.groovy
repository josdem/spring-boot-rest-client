package com.jos.dem.rest.client.service.impl

import org.springframework.stereotype.Service

import groovyx.net.http.RESTClient

import com.jos.dem.rest.client.service.RestClient
import com.jos.dem.rest.client.exception.BusinessException

import org.slf4j.Logger
import org.slf4j.LoggerFactory

@Service
class RestClientImpl implements RestClient {

  Logger log = LoggerFactory.getLogger(this.class)

  def getBeverage(){
    try {
      log.info "Calling Service"
      RESTClient restClient = new RESTClient()
      def result = restClient.get(
        uri : 'http://jugoterapia.josdem.io/jugoterapia-server/beverage/beverage?beverageId=35'
      )
      result.data
    } catch(Exception ex) {
      log.warn "Error ${ex.message}"
      throw new BusinessException(ex.message)
    }
  }

}
