.then(Commands.argument("${field$name}", DoubleArgumentType<#if field$type == "min">.doubleArg(${field$min})<#elseif field$type == "both">.doubleArg(${field$min}, ${field$max})<#else>.doubleArg()</#if>)<#if statement$args??>${statement$args}</#if>)