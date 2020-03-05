./gradlew :home:clean

./gradlew :home_api:assembleRelease
./gradlew :home_api:publish -Penv=stag -PpublishAar=true
./gradlew :home_api:publish -Penv=prod -PpublishAar=true

./gradlew :home:assembleRelease publishAar
./gradlew :home:publish -Penv=stag -PpublishAar=true
./gradlew :home:publish -Penv=prod -PpublishAar=true
