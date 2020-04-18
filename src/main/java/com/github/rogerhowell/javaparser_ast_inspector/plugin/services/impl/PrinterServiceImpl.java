package com.github.rogerhowell.javaparser_ast_inspector.plugin.services.impl;

import com.github.javaparser.ast.Node;
import com.github.javaparser.printer.DotPrinter;
import com.github.javaparser.printer.XmlPrinter;
import com.github.javaparser.printer.YamlPrinter;
import com.github.rogerhowell.javaparser_ast_inspector.plugin.printers.ASCIITreePrinter;
import com.github.rogerhowell.javaparser_ast_inspector.plugin.printers.CustomJsonPrinter;
import com.github.rogerhowell.javaparser_ast_inspector.plugin.printers.CypherPrinter;
import com.github.rogerhowell.javaparser_ast_inspector.plugin.printers.GraphMLPrinter;
import com.github.rogerhowell.javaparser_ast_inspector.plugin.services.PrinterService;
import com.intellij.openapi.project.Project;

public class PrinterServiceImpl implements PrinterService {

    private final boolean defaultOutputNodeType = true;


    public PrinterServiceImpl(Project project) {
    }


    public String asAsciiTreeText(Node node) {
        return this.asAsciiTreeText(node, defaultOutputNodeType);
    }
    public String asAsciiTreeText(Node node, boolean outputNodeType) {
        ASCIITreePrinter printer = new ASCIITreePrinter();
        return printer.output(node);
    }
    
    
    public String asCypher(Node node) {
        return this.asCypher(node, defaultOutputNodeType);
    }
    public String asCypher(Node node, boolean outputNodeType) {
        CypherPrinter printer = new CypherPrinter(outputNodeType);
        return printer.output(node);
    }


    public String asDot(Node node) {
        return this.asDot(node, defaultOutputNodeType);
    }
    public String asDot(Node node, boolean outputNodeType) {
        DotPrinter printer = new DotPrinter(outputNodeType);
        return printer.output(node);
    }


    public String asDotCustom(Node node) {
        return this.asDotCustom(node, defaultOutputNodeType);
    }
    public String asDotCustom(Node node, boolean outputNodeType) {
        DotPrinter printer = new DotPrinter(outputNodeType);
        return printer.output(node);
    }


    public String asGraphMl(Node node) {
        return this.asGraphMl(node, defaultOutputNodeType);
    }
    public String asGraphMl(Node node, boolean outputNodeType) {
        GraphMLPrinter printer = new GraphMLPrinter(outputNodeType);
        return printer.output(node);
    }


    public String asJavaPrettyPrint(Node node) {
        return this.asJavaPrettyPrint(node, defaultOutputNodeType);
    }
    public String asJavaPrettyPrint(Node node, boolean outputNodeType) {
        return node.toString();
    }


    public String asJsonCustom(Node node) {
        return this.asJsonCustom(node, defaultOutputNodeType);
    }
    public String asJsonCustom(Node node, boolean outputNodeType) {
        CustomJsonPrinter printer = new CustomJsonPrinter(outputNodeType);
        return printer.output(node);
    }


    public String asXml(Node node, boolean outputNodeType) {
        XmlPrinter printer = new XmlPrinter(outputNodeType);
        return printer.output(node);
    }
    public String asXml(Node node) {
        return this.asXml(node, this.defaultOutputNodeType);
    }


    public String asYaml(Node node, boolean outputNodeType) {
        YamlPrinter printer = new YamlPrinter(outputNodeType);
        return printer.output(node);
    }
    public String asYaml(Node node) {
        return this.asYaml(node, this.defaultOutputNodeType);
    }

}