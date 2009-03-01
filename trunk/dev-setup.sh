mvn install:install-file -Dfile="lib/jogl-1.1.1.jar" -DgroupId=javax.media -DartifactId=jogl -Dversion=1.1.1 -Dpackaging=jar
mvn install:install-file -Dfile="lib/gluegen-rt-1.0b5.jar" -DgroupId=javax.media -DartifactId=gluegen-rt -Dversion=1.0b5 -Dpackaging=jar
mvn install:install-file -Dfile="lib/bsh-2.04b.jar" -DgroupId=bsh -DartifactId=bsh -Dversion=2.04b -Dpackaging=jar
mvn install:install-file -Dfile="lib/vorbisspi-1.03.jar" -DgroupId=javazoom -DartifactId=vorbisspi -Dversion=1.03 -Dpackaging=jar
mvn eclipse:eclipse