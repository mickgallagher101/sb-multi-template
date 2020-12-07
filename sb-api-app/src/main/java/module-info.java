/**
 * sb-multi-template - Class description
 *
 * @author mick
 * @version 1.0
 * @since Dec 05, 2020
 */

module sb.apiapp {

    exports com.micks.pmapi;

    requires sb.library.one;
    requires sb.library.two;

    requires spring.core;
    requires spring.boot;
    requires spring.context;
    requires spring.boot.autoconfigure;
    requires spring.beans;
    requires spring.web;
    requires lombok;
}