public class ResourceToBorrow implements Borrow{

    @Override
    public void borrowedBy(Student student, ResourceType resourceType) {
        System.out.println("This "+ resourceType.getResourceType()+" is called " + resourceType.getTitle() + " is being borrowed by Student Number "
        + student.getStudID() + " named " + student.getName());
    }
    
}