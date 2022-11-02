public class Main {
    public static void main(String[] args) {
var firstBoxerWeight = 78.2;
var secondBoxerWeight = 82.7;
var totalWeightBoxers = firstBoxerWeight + secondBoxerWeight;
System.out.println("общий вес двух боксёров " + totalWeightBoxers + "кг");
var difference = secondBoxerWeight - firstBoxerWeight;
System.out.println("Разница в весе двух боксёров равна " + difference + "кг");
var percentDifference = totalWeightBoxers % firstBoxerWeight;
System.out.println("Разница в весе в процентном соотношении равна " + percentDifference);
var workingHours = 640;
var timeWorker = 8;
var allWorkers = workingHours / timeWorker;
System.out.println("Всего работников в компании – " + allWorkers + " человек");
allWorkers = allWorkers + 94;
timeWorker = workingHours / allWorkers;
System.out.println("Если в компании работает " + allWorkers + " человека, то всего " + timeWorker +
        " часа работы может быть поделено между сотрудниками");
    }
}