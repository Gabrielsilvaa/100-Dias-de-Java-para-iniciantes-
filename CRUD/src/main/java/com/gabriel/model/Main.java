package com.gabriel.model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class Main {

    private static EntityManagerFactory entityManagerFactory;

    public static void main(String[] args) {
        entityManagerFactory = Persistence.createEntityManagerFactory("jpa", null);

        //insert
        ModelPessoa modelPessoa = new ModelPessoa();
        modelPessoa.setIdade(32);
        modelPessoa.setName("Josemar");

        //read if not where
        List<ModelPessoa> modelList = null;

        //read with where
        ModelPessoa modelWhere = new ModelPessoa();

        ModelPessoa update = new ModelPessoa();

        ModelPessoa delet = new ModelPessoa();

        EntityManager em = entityManagerFactory.createEntityManager();

        try {

            em.getTransaction().begin();
            delet = em.find(ModelPessoa.class, 5L);
            em.remove(delet);
            em.getTransaction().commit();

            //Update
            /*em.getTransaction().begin();
            em.merge(update);
            em.getTransaction().commit();

            //Insert
            em.getTransaction().begin();
            em.persist(modelPessoa);
            em.getTransaction().commit();
            */

            //modelList = em.createQuery("from ModelPessoa").getResultList();
            //modelWhere = em.find(ModelPessoa.class, 3L);
            //System.out.println(modelWhere);

        }catch (Exception exception){
            em.getTransaction().rollback();

            System.out.println("Mensagem: " + exception.getMessage());
        }finally {
            em.close();
        }

        if (modelList != null){
            modelList.forEach(System.out::println);
        }
    }
}
