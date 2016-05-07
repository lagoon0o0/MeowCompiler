all: clean
	@mkdir -p ./bin
	@cd ./src/FrontEnd/LexarAndPaser && java -jar "../../../lib/antlr-4.5-complete.jar" -package FrontEnd.LexarAndPaser -Dlanguage=Java -listener -no-visitor -lib . Meow.g4
	@cd ./src && javac -cp "../lib/antlr-4.5-complete.jar" \
		./*/*/*.java \
		./*/*.java \
		./*.java \
		-d ../bin
	@cp -r ./lib ./bin
	@cd ./bin && jar xf ./lib/antlr-4.5-complete.jar\
			 && rm -rf ./META-INF \
			 && jar cef Main MeowCompiler.jar ./ \
			 && rm -rf ./lib/antlr-4.5-complete.jar ./Optimization ./MIPS ./IR ./IRVisitor ./RegisterAllocation ./AST ./FrontEnd Main.class ./SymbolTable ./org  ./st4hidden
clean:
	rm -rf ./bin
