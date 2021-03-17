plugins {
  groovy
}

repositories {
  jcenter()
}

dependencies {
  implementation(platform("com.amazonaws:aws-java-sdk-bom:1.11.955"))

  implementation("org.codehaus.groovy:groovy-all:2.5.7")
  implementation("org.apache.httpcomponents:httpclient:4.5.13")
  implementation("com.amazonaws:aws-java-sdk-ec2")
  implementation("com.amazonaws:aws-java-sdk-sts")

  testImplementation("org.spockframework:spock-core:1.3-groovy-2.5")
}
