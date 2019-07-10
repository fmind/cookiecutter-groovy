#!/usr/bin/env groovy

/**
 * Documentation of the script.
 */

@Grab('org.apache.commons:commons-lang3:3.9')
import org.apache.commons.lang3.StringUtils

def cli = new CliBuilder(usage: "${this.class.name}.groovy [options]")
cli.i(longOpt: 'input', args: 1, optionalArg: '-', 'use "-" for stdin')
cli.h(longOpt: 'help', 'display this message')

/**
 * Documentation of the function.
 *
 * @param str Text to be reversed.
 * @return String reversed text.
 */
String reverse(String str) {
    return StringUtils.reverse(str)
}


def opts = cli.parse(this.args)

if (opts.help) {
    cli.usage()
    System.exit(0)
}


def input = opts.input != '-' ? new File(opts.input) : System.in

println(reverse(input.text))
