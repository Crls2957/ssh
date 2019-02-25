package entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "test", schema = "kaidu", catalog = "")
public class TestEntity {
    private int id;
    private String name;
    private String passwd;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name", nullable = true, length = 255)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "passwd", nullable = true, length = 255)
    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TestEntity that = (TestEntity) o;
        return id == that.id &&
                Objects.equals(name, that.name) &&
                Objects.equals(passwd, that.passwd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, passwd);
    }
}
