import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PostannonceComponent } from './postannonce.component';

describe('PostannonceComponent', () => {
  let component: PostannonceComponent;
  let fixture: ComponentFixture<PostannonceComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PostannonceComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(PostannonceComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
