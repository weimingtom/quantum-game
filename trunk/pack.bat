call mvn clean assembly:assembly -DdescriptorId=jar-with-dependencies
call mvn jar:sign -Dkeystore=quantum -Dstorepass=quantum -Dalias=quantum -Dsignedjar=target\quantum.jar