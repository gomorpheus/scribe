buildscript {
	repositories {
		mavenLocal()
		jcenter()
	}
	dependencies {
	}
}

subprojects {
	version = '0.1.1'
}

apply plugin: 'groovy'
apply plugin: 'idea'

group = 'com.bertramlabs.plugins'

repositories {
	mavenLocal()
	jcenter()
	mavenCentral()
}

dependencies {
	compile 'org.codehaus.groovy:groovy:2.0.7'
	compile 'commons-logging:commons-logging:1.1.1'
	testCompile 'org.spockframework:spock-core:0.7-groovy-2.0'
}

test {
	testLogging {
		exceptionFormat = 'full'
		showStandardStreams = true
	}
}

task wrapper(type: Wrapper) {
	gradleVersion = '3.3'
}
tasks.withType(JavaExec) {
    // Assign all Java system properties from
    // the command line to the JavaExec task.
    systemProperties System.properties
}

