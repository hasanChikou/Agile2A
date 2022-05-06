import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AnnonceproposerComponent } from './annonceproposer.component';

describe('AnnonceproposerComponent', () => {
  let component: AnnonceproposerComponent;
  let fixture: ComponentFixture<AnnonceproposerComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AnnonceproposerComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AnnonceproposerComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
