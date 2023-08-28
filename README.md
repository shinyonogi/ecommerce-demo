# EC サイトデモ

このプロジェクトは EC サイトのデモアプリケーションです。Spring Boot と React を使って実装されています！

## 前提条件

- Java 17
- Maven
- Docker & Docker Compose
- Node.js
- React

## セットアップ方法

### Docker

1. Docker と Docker Compose がインストールされていることを確認してください。
2. Docker デーモンが稼働していることを確認してください。

3. プロジェクトのルートディレクトリに移動します。

4. Docker を使ってデータベース、バックエンド、フロントエンドを一括で起動します。

`docker-compose up --build`

アプリケーションは、デフォルトで http://localhost:3000 でアクセス可能です。バックエンド API は http://localhost:8080 にて動作します。

- バックエンド: Spring Boot, PostgreSQL
- フロントエンド: React, TypeScript
