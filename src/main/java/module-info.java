module com.loollab.data_structures {
    requires spring.boot;
    requires spring.boot.autoconfigure;
    requires spring.context;
    requires spring.beans;
    requires spring.web;
    requires static lombok;
    requires org.slf4j;

    opens com.loollab.data_structures to spring.core, spring.beans, spring.context;
    exports com.loollab.data_structures to spring.boot.devtools;
}