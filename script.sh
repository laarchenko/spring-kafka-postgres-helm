./mvnw package -DskipTests
docker build -t vampir/spring-app .
docker push vampir/spring-app:latest
kubectl delete -f spring-app.yaml
kubectl apply -f spring-app.yaml
kubectl wait --for=condition=ready pod -l app=spring-app
sleep 5
kubectl logs -l app=spring-app
