/**
 * sb-multi-template - Class description
 *
 * @author mick
 * @version 1.0
 * @since Dec 05, 2020
 */

module sb.webapp {

    requires sb.library.one;

    // Required Spring modules
    requires spring.boot;
    requires spring.context;
    requires spring.beans;
    requires spring.core;
    requires spring.boot.autoconfigure;

    requires lombok;
}