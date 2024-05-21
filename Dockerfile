# ベースイメージの指定
FROM tomcat:10.0-jdk17-openjdk-slim

# ワーキングディレクトリの設定
WORKDIR /usr/local/tomcat/webapps/

# アプリケーションのWARファイルをコンテナにコピー
COPY build/libs/Todo-0.0.1-SNAPSHOT.war ./ROOT.war

# ポートの公開
EXPOSE 8080

# Tomcatサーバーの起動コマンド
CMD ["catalina.sh", "run"]
