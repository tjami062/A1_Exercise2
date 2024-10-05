package edu.seg2105.assignment1.exercise2.entities;

public class TeachingAssistant extends Instructor {
    private final int max_courses = 3;

    /**
     * Constructs a new TeachingAssistant with the specified details.
     *
     * @param firstName the first name of the TeachingAssistant
     * @param lastName  the last name of the TeachingAssistant
     * @param id        the unique identifier of the TeachingAssistant
     * @param salary    the salary of the TeachingAssistant
     */
    public TeachingAssistant(String firstName, String lastName, String id, double salary) {
        super(firstName, lastName, id, salary);
    }

    /**
     * Assigns a course to the TeachingAssistant if the maximum number of courses is
     * not exceeded.
     * 
     * @param course the course to be assigned
     * @return true if the course was successfully assigned, false otherwise
     */
    @Override
    public boolean assignCourse(Course course) {
        if (courses.size() < max_courses) {
            courses.add(course);
            return true;
        } else {
            return false;
        }

    }
}
