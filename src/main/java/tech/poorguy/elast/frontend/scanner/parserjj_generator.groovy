#!/usr/bin/groovy
new File('./temp.txt').eachLine {
    println "\t|\t<${it.toUpperCase()}\t: \"${it}\">"
}