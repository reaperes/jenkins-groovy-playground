package playground

import groovy.json.JsonSlurper
import org.apache.http.client.methods.HttpGet
import org.apache.http.impl.client.BasicResponseHandler
import org.apache.http.impl.client.HttpClientBuilder

def request = new HttpGet("http://httpbin.org/response-headers")

def jsonSlurper = new JsonSlurper()
def httpClient = HttpClientBuilder.create().build()
def responseRaw = httpClient.execute(request, new BasicResponseHandler())
def response = jsonSlurper.parseText(responseRaw)

print response
