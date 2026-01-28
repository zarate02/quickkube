docker build -t spring-quick-$1:1.0 . -f demo-$1/Dockerfile
minikube image load spring-quick-$1:1.0