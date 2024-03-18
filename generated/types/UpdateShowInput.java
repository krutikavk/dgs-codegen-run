package tester.generated.types;

import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.BitSet;

public class UpdateShowInput {
  private String id;

  private String title;

  private Integer releaseYear;

  private final transient BitSet fieldsPresent = new BitSet();

  public UpdateShowInput() {
  }

  public UpdateShowInput(String id, String title, Integer releaseYear) {
    this.id = id;
    this.title = title;
    this.releaseYear = releaseYear;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
    setField(Field.ID);
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
    setField(Field.TITLE);
  }

  public Integer getReleaseYear() {
    return releaseYear;
  }

  public void setReleaseYear(Integer releaseYear) {
    this.releaseYear = releaseYear;
    setField(Field.RELEASEYEAR);
  }

  private void setField(Field field) {
    fieldsPresent.set(field.getOrdinal());
  }

  private boolean isSet(Field field) {
    return fieldsPresent.get(field.getOrdinal());
  }

  @Override
  public String toString() {
    return "UpdateShowInput{" + "id='" + id + "'," +"title='" + title + "'," +"releaseYear='" + releaseYear + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UpdateShowInput that = (UpdateShowInput) o;
        return java.util.Objects.equals(id, that.id) &&
                            java.util.Objects.equals(title, that.title) &&
                            java.util.Objects.equals(releaseYear, that.releaseYear) &&
                            java.util.Objects.equals(fieldsPresent, that.fieldsPresent);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(id, title, releaseYear, fieldsPresent);
  }

  public static tester.generated.types.UpdateShowInput.Builder newBuilder() {
    return new Builder();
  }

  public enum Field {
    ID,

    TITLE,

    RELEASEYEAR;

    int ordinal = -1;

    Field() {
      this.ordinal = ordinal;
    }

    public int getOrdinal() {
      return ordinal;
    }
  }

  public static class Builder {
    private String id;

    private String title;

    private Integer releaseYear;

    private final transient BitSet fieldsPresent = new BitSet();

    public UpdateShowInput build() {
      tester.generated.types.UpdateShowInput result = new tester.generated.types.UpdateShowInput();
      result.id = this.id;
      result.title = this.title;
      result.releaseYear = this.releaseYear;
      for (Field field: Field.values()) {
          if (this.isSet(field)) {
             result.setField(field);
          }
      }
      return result;
    }

    private void setField(Field field) {
      fieldsPresent.set(field.getOrdinal());
    }

    private boolean isSet(Field field) {
      return fieldsPresent.get(field.getOrdinal());
    }

    public tester.generated.types.UpdateShowInput.Builder id(String id) {
      this.id = id;
      setField(Field.ID);
      return this;
    }

    public tester.generated.types.UpdateShowInput.Builder title(String title) {
      this.title = title;
      setField(Field.TITLE);
      return this;
    }

    public tester.generated.types.UpdateShowInput.Builder releaseYear(Integer releaseYear) {
      this.releaseYear = releaseYear;
      setField(Field.RELEASEYEAR);
      return this;
    }
  }
}
