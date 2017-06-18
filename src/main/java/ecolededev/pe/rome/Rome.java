package ecolededev.pe.rome;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by grenouille on 18/06/2017.
 */
@SuppressWarnings("serial") @Entity @Table(name = "rome") public class Rome implements Serializable
{
        @Id
        @GeneratedValue
        private Long id;

        private String code;
        private String libelle;

        public Rome(String code, String libelle)
        {
                this.code = code;
                this.libelle = libelle;
        }

        public Long getId()
        {
                return id;
        }

        public void setId(Long id)
        {
                this.id = id;
        }

        public String getCode()
        {
                return code;
        }

        public void setCode(String code)
        {
                this.code = code;
        }

        public String getLibelle()
        {
                return libelle;
        }

        public void setLibelle(String libelle)
        {
                this.libelle = libelle;
        }
}
